package com.moonstudio.dp.proxy.dynamic;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

// 源码,动态编译源码
// （技术）可以用：
// JDK1.6后的complier
// cglib(直接写二进制文件)(book:深入Java虚拟机)
// asm
public class Proxy {
	public static Object newProxyInstance(Class infce,InvocationHandler handler) throws Exception {
		String rt = "\r\n";
		String methodStr = "";
		
		Method[] methods = infce.getMethods();
		for (Method m : methods) {
			methodStr +=
"@Override"+rt+
"public void "+m.getName()+"(){"+rt+
"		try {"+rt+
"			Method md = " + infce.getName()+".class.getMethod(\""+m.getName()+"\");" +rt+
"			ih.invoke(this, md);"+rt+
"		} catch (Exception e) {"+rt+
"			e.printStackTrace();"+rt+
"		}"+rt+
"}";
		}
		
		
		String src = "package com.moonstudio.dp.proxy.dynamic.compiler;"+rt+
"import java.lang.reflect.Method;"+rt+
"import com.moonstudio.dp.proxy.dynamic.InvocationHandler;"+rt+
"//这是动态生成的类"+rt+
"public class $ThrFouDynamicProxy implements "+infce.getName()+" {"+rt+
"	InvocationHandler ih;"+rt+
"	public $ThrFouDynamicProxy(InvocationHandler ih) {"+rt+
"		this.ih = ih;"+rt+
"	}"+rt+
methodStr+

"}";
		
		

		String fileName = System.getProperty("user.dir")
				+ "/src/com/moonstudio/dp/proxy/dynamic/compiler/$ThrFouDynamicProxy.java";// 项目的根路径
		System.out.println("Proxy："+fileName);

		
		
		
		
		
		// 写入文件
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		
		
		
		
		
		
		
		// 编译源文件
		// 拿到编译器就是javac
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println("Proxy:"+compiler);
		StandardJavaFileManager sjfm = compiler.getStandardFileManager(null,
				null, null);
		Iterable units = sjfm.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, sjfm, null, null, null,
				units);
		t.call();// 编译
		sjfm.close();

		
		
		
		
		
		
		// 加载到内存，并生成对象实例
		// load into memory and create an instance
		// 前面生成的文件，编译，完全可以直接生成到bin目录里面，这样classloader就可以直接load了，不用我们这里的urlclassload
		// 这里的意思就是说，无论生成到哪里的class文件，都可以被我们load进来
		URL[] urls = new URL[] { new URL("file:/"
				+ System.getProperty("user.dir") + "/src") };
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.moonstudio.dp.proxy.dynamic.compiler.$ThrFouDynamicProxy");
		System.out.println("Proxy:"+c);
		
		
		
		
		
		
		Constructor cst = c.getConstructor(InvocationHandler.class);
		Object obj = cst.newInstance(handler);
		return obj;
	}
}
