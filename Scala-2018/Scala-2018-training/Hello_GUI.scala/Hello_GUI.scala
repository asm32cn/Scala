// Hello_GUI.scala

import scala.swing._;

object Hello_GUI extends SimpleSwingApplication{
	def top = new MainFrame {
		title = "Hello_GUI.scala(GUI测试)";
		location = new Point(600, 300);
		preferredSize = new Dimension(400, 200);

		contents = new Button {
			text = "Scala => Spark!!!";
			border = Swing.EmptyBorder(50, 50, 50, 50);
		}
	}
}