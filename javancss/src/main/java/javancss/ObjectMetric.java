/*
Copyright (C) 2000 Chr. Clemens Lee <clemens@kclee.com>.

This file is part of JavaNCSS
(http://www.kclee.com/clemens/java/javancss/).

JavaNCSS is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 2, or (at your option) any
later version.

JavaNCSS is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with JavaNCSS; see the file COPYING.  If not, write to
the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA 02111-1307, USA.  */

package javancss;

/**
 * Basic data class to store all metrics attached to an object.
 *
 * @author  Herv� Boutemy
 * @version $Id: ObjectMetric.java 121 2009-01-17 22:19:45Z hboutemy $
 */
public class ObjectMetric extends Metric
{
    /** Cyclomatic Complexity Number (McCabe metric) */
    public int ccn = 0;
    public int functions = 0;
    public int classes = 0;

    public ObjectMetric()
    {
        super();
    }

    public void clear()
    {
        super.clear();
        ccn = 0;
        functions = 0;
        classes = 0;
    }
}
