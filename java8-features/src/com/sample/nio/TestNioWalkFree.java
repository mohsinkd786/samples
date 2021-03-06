package com.sample.nio;

import static java.nio.file.FileVisitResult.CONTINUE;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TestNioWalkFree extends SimpleFileVisitor<Path> {

	public static void main(String[] abc) throws IOException {
		Path path = Paths.get("D:\\test.txt");
		TestNioWalkFree fileVisitor = new TestNioWalkFree();
		Files.walkFileTree(path, fileVisitor);
		//

	}

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {

		if (basicFileAttributes.isRegularFile()) {
			System.out.println(path + " is a regular file with size " + basicFileAttributes.size());
		} else if (basicFileAttributes.isSymbolicLink()) {
			System.out.println(path + " is a symbolic link.");
		} else {
			System.out.println(path + " is not a regular file or symbolic link.");
		}
		return CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path path, IOException ioException) {
		System.out.println(path + " visited.");
		return CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path path, IOException ioException) {
		System.err.println(ioException);
		return CONTINUE;
	}
}