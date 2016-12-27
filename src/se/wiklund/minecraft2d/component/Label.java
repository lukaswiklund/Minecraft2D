package se.wiklund.minecraft2d.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import se.wiklund.minecraft2d.util.UIUtils;

public class Label extends Component {
	
	protected String text;
	protected Font font;
	protected Color color;
	
	public Label(String text, Font font, double x, double y) {
		this(text, font, Color.BLACK, x, y);
	}
	
	public Label(String text, Font font, Color color, double x, double y) {
		super(x, y, UIUtils.getStringWidth(text, font), font.getSize());
		this.text = text;
		this.font = font;
	}

	@Override
	public void render(Graphics2D g) {
		g.setColor(color);
		g.setFont(font);
		g.drawString(text, (int) x, (int) y);
	}
	
	public void setText(String text) {
		this.text = text;
		width = UIUtils.getStringWidth(text, font);
	}
}
