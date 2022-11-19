<h2><a href="https://leetcode.com/problems/license-key-formatting/">482. License Key Formatting</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a license key represented as a string <code style="user-select: auto;">s</code> that consists of only alphanumeric characters and dashes. The string is separated into <code style="user-select: auto;">n + 1</code> groups by <code style="user-select: auto;">n</code> dashes. You are also given an integer <code style="user-select: auto;">k</code>.</p>

<p style="user-select: auto;">We want to reformat the string <code style="user-select: auto;">s</code> such that each group contains exactly <code style="user-select: auto;">k</code> characters, except for the first group, which could be shorter than <code style="user-select: auto;">k</code> but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the reformatted license key</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "5F3Z-2e-9-w", k = 4
<strong style="user-select: auto;">Output:</strong> "5F3Z-2E9W"
<strong style="user-select: auto;">Explanation:</strong> The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "2-5g-3-J", k = 2
<strong style="user-select: auto;">Output:</strong> "2-5G-3J"
<strong style="user-select: auto;">Explanation:</strong> The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of English letters, digits, and dashes <code style="user-select: auto;">'-'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>