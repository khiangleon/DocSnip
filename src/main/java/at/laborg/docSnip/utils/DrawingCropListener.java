package at.laborg.docSnip.utils;

import java.util.List;

import at.laborg.docSnip.gui.DrawableCropRect;

public interface DrawingCropListener {

	void onCropRectanglesAltered(List<DrawableCropRect> rectangle, int width, int height);
}
