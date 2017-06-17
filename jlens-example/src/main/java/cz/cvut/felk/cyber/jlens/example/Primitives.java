/*
    This file is part of jLens.

    jLens is free software: you can redistribute it and/or modify it under the
    terms of the GNU Lesser General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    jLens is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
    FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
    more details.

    You should have received a copy of the GNU Lesser General Public License
    along with jLens.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.cvut.felk.cyber.jlens.example;

import cz.cvut.felk.cyber.jlens.*;

@LensProperties
public class Primitives {
    private byte fByte;
    private short fShort;
    private int fInt;
    private long fLong;
    private float fFloat;
    private double fDouble;
    private boolean fBoolean;
    private char fChar;

    public byte getFByte()       { return this.fByte; }
    public void setFByte(byte v) { this.fByte = v; }

    public short getFShort()       { return this.fShort; }
    public void setFShort(short v) { this.fShort = v; }

    public int getFInt()       { return this.fInt; }
    public void setFInt(int v) { this.fInt = v; }

    public long getFLong()       { return this.fLong; }
    public void setFLong(long v) { this.fLong = v; }

    public float getFFloat()       { return this.fFloat; }
    public void setFFloat(float v) { this.fFloat = v; }

    public double getFDouble()       { return this.fDouble; }
    public void setFDouble(double v) { this.fDouble = v; }

    public boolean getFBoolean()       { return this.fBoolean; }
    public void setFBoolean(boolean v) { this.fBoolean = v; }

    public char getFChar()       { return this.fChar; }
    public void setFChar(char v) { this.fChar = v; }
}
