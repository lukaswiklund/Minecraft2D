package se.wiklund.minecraft2d.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import se.wiklund.minecraft2d.Main;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

	private static double x, y;
	private static boolean down;

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX() / Main.SCALE;
		y = e.getY() / Main.SCALE;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX() / Main.SCALE;
		y = e.getY() / Main.SCALE;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		down = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		down = false;
		Main.getState().onMouseClick(e.getButton(), (int) (e.getX() / Main.SCALE), (int) (e.getY() / Main.SCALE));
	}

	public static double getX() {
		return x;
	}

	public static double getY() {
		return y;
	}

	public static boolean isDown() {
		return down;
	}
}
