<h2><a href="https://leetcode.com/problems/house-robber-iii/">337. House Robber III</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The thief has found himself a new place for his thievery again. There is only one entrance to this area, called <code style="user-select: auto;">root</code>.</p>

<p style="user-select: auto;">Besides the <code style="user-select: auto;">root</code>, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree. It will automatically contact the police if <strong style="user-select: auto;">two directly-linked houses were broken into on the same night</strong>.</p>

<p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of the binary tree, return <em style="user-select: auto;">the maximum amount of money the thief can rob <strong style="user-select: auto;">without alerting the police</strong></em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/10/rob1-tree.jpg" style="width: 277px; height: 293px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [3,2,3,null,3,null,1]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/10/rob2-tree.jpg" style="width: 357px; height: 293px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [3,4,5,1,3,null,1]
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation:</strong> Maximum amount of money the thief can rob = 4 + 5 = 9.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= Node.val &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>