package com.sample.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Java NIO Delete Directory

public class TestNioFileDelete extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException {
		Files.delete(file);
		System.out.println(file.getFileName() + " deleted.");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path directory, IOException ioe) throws IOException {
		Files.delete(directory);
		System.out.println(directory.getFileName() + " directory deleted.");
		return FileVisitResult.CONTINUE;
	}

	public static void main(String args[]) {
		Path directoryPath = Paths.get(".", "todelete");
		TestNioFileDelete delelteVisitor = new TestNioFileDelete();
		try {
			Files.walkFileTree(directoryPath, delelteVisitor);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}