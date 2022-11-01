<h2><a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365. How Many Numbers Are Smaller Than the Current Number</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the array <code style="user-select: auto;">nums</code>, for each <code style="user-select: auto;">nums[i]</code> find out how many numbers in the array are smaller than it. That is, for each <code style="user-select: auto;">nums[i]</code> you have to count the number of valid <code style="user-select: auto;">j's</code>&nbsp;such that&nbsp;<code style="user-select: auto;">j != i</code> <strong style="user-select: auto;">and</strong> <code style="user-select: auto;">nums[j] &lt; nums[i]</code>.</p>

<p style="user-select: auto;">Return the answer in an array.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [8,1,2,2,3]
<strong style="user-select: auto;">Output:</strong> [4,0,1,1,3]
<strong style="user-select: auto;">Explanation:</strong> 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [6,5,4,8]
<strong style="user-select: auto;">Output:</strong> [2,1,0,3]
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [7,7,7,7]
<strong style="user-select: auto;">Output:</strong> [0,0,0,0]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= nums.length &lt;= 500</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 100</code></li>
</ul>
</div>