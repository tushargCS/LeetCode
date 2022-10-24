<h2><a href="https://leetcode.com/problems/concatenation-of-array/">1929. Concatenation of Array</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code> of length <code style="user-select: auto;">n</code>, you want to create an array <code style="user-select: auto;">ans</code> of length <code style="user-select: auto;">2n</code> where <code style="user-select: auto;">ans[i] == nums[i]</code> and <code style="user-select: auto;">ans[i + n] == nums[i]</code> for <code style="user-select: auto;">0 &lt;= i &lt; n</code> (<strong style="user-select: auto;">0-indexed</strong>).</p>

<p style="user-select: auto;">Specifically, <code style="user-select: auto;">ans</code> is the <strong style="user-select: auto;">concatenation</strong> of two <code style="user-select: auto;">nums</code> arrays.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the array </em><code style="user-select: auto;">ans</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,1]
<strong style="user-select: auto;">Output:</strong> [1,2,1,1,2,1]
<strong style="user-select: auto;">Explanation:</strong> The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,3,2,1]
<strong style="user-select: auto;">Output:</strong> [1,3,2,1,1,3,2,1]
<strong style="user-select: auto;">Explanation:</strong> The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 1000</code></li>
</ul>
</div>