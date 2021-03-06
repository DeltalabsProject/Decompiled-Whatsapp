package android.support.v4.graphics.drawable;

import android.content.res.Resources.Theme;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class DrawableWrapperLollipop extends DrawableWrapperKitKat {
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.mDrawable.setHotspotBounds(i, i2, i3, i4);
    }

    public void applyTheme(Theme theme) {
        this.mDrawable.applyTheme(theme);
    }

    public void getOutline(Outline outline) {
        this.mDrawable.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.mDrawable.setHotspot(f, f2);
    }

    public Rect getDirtyBounds() {
        return this.mDrawable.getDirtyBounds();
    }

    DrawableWrapperLollipop(Drawable drawable) {
        super(drawable);
    }

    public boolean canApplyTheme() {
        return this.mDrawable.canApplyTheme();
    }
}
