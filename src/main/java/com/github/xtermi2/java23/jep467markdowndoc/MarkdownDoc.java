package com.github.xtermi2.java23.jep467markdowndoc;

/// # This is my `MarkdownDoc` class
///
/// ## Goals:
///
/// - Make API documentation comments easier to write and easier to read in source form by introducing the ability to use Markdown syntax in documentation comments, alongside HTML elements and JavaDoc tags.
/// - Do not adversely affect the interpretation of existing documentation comments.
/// - Extend the Compiler Tree API to enable other tools that analyze documentation comments to handle Markdown content in those comments.
///
///
/// ## A Table example
///
/// | Latin | Greek |
/// |-------|-------|
/// | a     | alpha |
/// | b     | beta  |
/// | c     | gamma |
///
///
/// ## A code block:
///
/// ```
/// @Override
/// public void m() {}
/// ```
/// ```
/// {
///   "name": "Java23"
/// }
/// ```
/// ```css
/// p { color: red }
/// ```
public class MarkdownDoc {
}
