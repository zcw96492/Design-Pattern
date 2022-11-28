# 建造者模式
<hr/>

### 概念
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
</p>
<hr>

### 介绍
<b>意图：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。<br/>
<b>主要解决：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。<br/>
<b>何时使用：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一些基本部件不会变，而其组合经常变化的时候。<br/>
<b>如何解决：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;将变与不变分离开。<br/>
<b>关键代码：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、建造者：创建和提供实例。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、导演：管理建造出来的实例的依赖关系。<br/>
<b>应用实例：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、JAVA 中的 StringBuilder。<br/>
<b>优点：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、建造者独立，易扩展。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、便于控制细节风险。<br/>
<b>缺点：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、产品必须有共同点，范围有限制。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、如内部变化复杂，会有很多的建造类。<br/>
<b>使用场景：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、需要生成的对象具有复杂的内部结构。<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、需要生成的对象内部属性本身相互依赖。<br/>
<b>注意事项：</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。