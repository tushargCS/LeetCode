<h2><a href="https://leetcode.com/problems/construct-the-rectangle/">492. Construct the Rectangle</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">The area of the rectangular web page you designed must equal to the given target area.</li>
	<li style="user-select: auto;">The width <code style="user-select: auto;">W</code> should not be larger than the length <code style="user-select: auto;">L</code>, which means <code style="user-select: auto;">L &gt;= W</code>.</li>
	<li style="user-select: auto;">The difference between length <code style="user-select: auto;">L</code> and width <code style="user-select: auto;">W</code> should be as small as possible.</li>
</ol>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array <code style="user-select: auto;">[L, W]</code> where <code style="user-select: auto;">L</code> and <code style="user-select: auto;">W</code> are the length and width of the&nbsp;web page you designed in sequence.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> area = 4
<strong style="user-select: auto;">Output:</strong> [2,2]
<strong style="user-select: auto;">Explanation:</strong> The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> area = 37
<strong style="user-select: auto;">Output:</strong> [37,1]
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> area = 122122
<strong style="user-select: auto;">Output:</strong> [427,286]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= area &lt;= 10<sup style="user-select: auto;">7</sup></code></li>
</ul>
</div>