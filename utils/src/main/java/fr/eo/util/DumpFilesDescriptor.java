/*
 * Copyright (C) 2012 Picon software
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package fr.eo.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author picon.software
 */
public class DumpFilesDescriptor implements Serializable {
	static final long serialVersionUID = 7775689390260955333L;

    public int lineNumbers;
    public List<String> dumpFileNames = new ArrayList<>();
}
