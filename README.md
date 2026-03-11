# Playwright Java Automation

A Java automation project using Playwright for browser testing and web automation.

## Getting Started

- Install Java 11 or higher
- Add Playwright Java dependency to your project
- Run tests with Maven or Gradle

## Features

- Cross-browser testing (Chrome, Firefox, Safari)
- Headless and headed browser modes
- Network interception and mocking
- Screenshot and video recording
- Mobile device emulation

## Usage

```java
Browser browser = playwright.chromium().launch();
Page page = browser.newPage();
page.navigate("https://example.com");
```