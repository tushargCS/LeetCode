<h2><a href="https://leetcode.com/problems/apply-operations-to-an-array/">2460. Apply Operations to an Array</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> array <code style="user-select: auto;">nums</code> of size <code style="user-select: auto;">n</code> consisting of <strong style="user-select: auto;">non-negative</strong> integers.</p>

<p style="user-select: auto;">You need to apply <code style="user-select: auto;">n - 1</code> operations to this array where, in the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> operation (<strong style="user-select: auto;">0-indexed</strong>), you will apply the following on the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> element of <code style="user-select: auto;">nums</code>:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">If <code style="user-select: auto;">nums[i] == nums[i + 1]</code>, then multiply <code style="user-select: auto;">nums[i]</code> by <code style="user-select: auto;">2</code> and set <code style="user-select: auto;">nums[i + 1]</code> to <code style="user-select: auto;">0</code>. Otherwise, you skip this operation.</li>
</ul>

<p style="user-select: auto;">After performing <strong style="user-select: auto;">all</strong> the operations, <strong style="user-select: auto;">shift</strong> all the <code style="user-select: auto;">0</code>'s to the <strong style="user-select: auto;">end</strong> of the array.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, the array <code style="user-select: auto;">[1,0,2,0,0,1]</code> after shifting all its <code style="user-select: auto;">0</code>'s to the end, is <code style="user-select: auto;">[1,2,1,0,0,0]</code>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the resulting array</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that the operations are applied <strong style="user-select: auto;">sequentially</strong>, not all at once.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,2,1,1,0]
<strong style="user-select: auto;">Output:</strong> [1,4,2,0,0,0]
<strong style="user-select: auto;">Explanation:</strong> We do the following operations:
- i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
- i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,<strong style="user-select: auto;"><u style="user-select: auto;">4</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">0</u></strong>,1,1,0].
- i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
- i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,<strong style="user-select: auto;"><u style="user-select: auto;">2</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">0</u></strong>,0].
- i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,<strong style="user-select: auto;"><u style="user-select: auto;">0</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">0</u></strong>].
After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,1]
<strong style="user-select: auto;">Output:</strong> [1,0]
<strong style="user-select: auto;">Explanation:</strong> No operation can be applied, we just shift the 0 to the end.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= nums.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 1000</code></li>
</ul>
</div>