package com.test;

public class Test2 {
  public static void test2(String input) {
    ProcessBuilder processBuilder = new ProcessBuilder();
    String cmd = "/usr/folder/ '" + input + "'";
    processBuilder.command("bash", "-c", cmd);
  }
}
