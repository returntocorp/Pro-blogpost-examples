package com;

// snippet
class Test {
    @RequestMapping(value = "/test")
    String test(@RequestParam String input) {
        ProcessBuilder processBuilder = new ProcessBuilder();
	    String cmd = "/usr/folder/ '" + input + "'";
			// MATCHES
	    processBuilder.command("bash", "-c", cmd);
    }
}
