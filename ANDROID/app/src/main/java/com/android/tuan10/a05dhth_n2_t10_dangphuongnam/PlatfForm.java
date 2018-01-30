package com.android.tuan10.a05dhth_n2_t10_dangphuongnam;

/**
 * Created by Dell on 12/5/2017.
 */

public class PlatfForm
{
    private int icon;
    private String title;
    private String tennuoc;

    public PlatfForm(int icon, String title, String tennuoc) {
        this.setIcon(icon);
        this.setTitle(title);
        this.setTennuoc(tennuoc);
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTennuoc() {
        return tennuoc;
    }

    public void setTennuoc(String tennuoc) {
        this.tennuoc = tennuoc;
    }
}
