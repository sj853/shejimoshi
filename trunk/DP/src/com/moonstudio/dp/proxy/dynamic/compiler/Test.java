package com.moonstudio.dp.proxy.dynamic.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

import com.moonstudio.dp.proxy.dynamic.Moveable;
import com.moonstudio.dp.proxy.dynamic.Tank;

public class Test {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException, IllegalArgumentException,
			InstantiationException, IllegalAccessException,
			InvocationTargetException, SecurityException, NoSuchMethodException {
		
		
		// Windows下面的换行
		String rt = "\r\n";
		
		String src = "package com.moonstudio.dp.proxy.dynamic.compiler;"+rt+
"import com.moonstudio.dp.proxy.dynamic.Moveable;"+rt+
"//这是动态生成的类"+rt+
"public class TankTimeProxy implements Moveable {"+rt+

"	public TankTimeProxy(Moveable m) {"+rt+
"		super();"+rt+
"		this.m = m;"+rt+
"	}"+rt+

"	Moveable m;"+rt+

"	@Override"+rt+
"	public void move() {"+rt+
"		System.out.println(\"时间一\");"+rt+
"		m.move();"+rt+
"		System.out.println(\"时间二\");"+rt+
"	}"+rt+
"}";
		
		
		String fileName = System.getProperty("user.dir")
				+ "/src/com/moonstudio/dp/proxy/dynamic/compiler/TankTimeProxy.java";// 项目的根路径
		System.out.println(fileName);

		
		
		
		
		
		// 写入文件
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		
		
		
		
		
		
		
		// 编译源文件
		// 拿到编译器就是javac
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println(compiler);
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
		Class c = ul.loadClass("com.moonstudio.dp.proxy.dynamic.compiler.TankTimeProxy");
		System.out.println(c);
		
		
		
		
		
		
		Constructor cst = c.getConstructor(Moveable.class);
		Moveable m = (Moveable) cst.newInstance(new Tank());
		m.move();
		
	}
}
