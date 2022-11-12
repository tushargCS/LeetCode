<h2><a href="https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/">671. Second Minimum Node In a Binary Tree</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly <code style="user-select: auto;">two</code> or <code style="user-select: auto;">zero</code> sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property&nbsp;<code style="user-select: auto;">root.val = min(root.left.val, root.right.val)</code>&nbsp;always holds.</p>

<p style="user-select: auto;">Given such a binary tree, you need to output the <b style="user-select: auto;">second minimum</b> value in the set made of all the nodes' value in the whole tree.</p>

<p style="user-select: auto;">If no such second minimum value exists, output -1 instead.</p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/15/smbt1.jpg" style="width: 431px; height: 302px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [2,2,5,null,null,5,7]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> The smallest value is 2, the second smallest value is 5.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/15/smbt2.jpg" style="width: 321px; height: 182px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [2,2,2]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> The smallest value is 2, but there isn't any second smallest value.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 25]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">root.val == min(root.left.val, root.right.val)</code>&nbsp;for each internal node of the tree.</li>
</ul>
</div>