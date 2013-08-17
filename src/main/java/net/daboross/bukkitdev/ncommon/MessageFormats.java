/*
 * Copyright (C) 2013 daboross
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.daboross.bukkitdev.ncommon;

import net.daboross.bukkitdev.commandexecutorbase.ColorList;

/**
 *
 * @author daboross
 */
public class MessageFormats {

    public static final MessageFormats DEFAULT = new MessageFormats(
            "%s" + ColorList.DATA + "%s" + ColorList.REG + ", " + ColorList.DATA + "%s" + ColorList.REG + ", " + ColorList.DATA + "%s" + ColorList.REG + ", " + ColorList.DATA + "%s",
            ColorList.NAME + "%s" + ColorList.REG + ": " + ColorList.DATA + "%s" + ColorList.REG + ", " + ColorList.DATA + "%s" + ColorList.REG + ", " + ColorList.DATA + "%s" + ColorList.REG + ", " + ColorList.DATA + "%s",
            "joinConsole",
            "leaveConsole");
    /**
     * First parameter is server name, Second parameter is X, Third parameter is
     * Y, Fourth parameter is Z, Fifth parameter is world.
     */
    public final String whereCommandFormat;
    /**
     * First parameter is player name, Second parameter is X, Third parameter is
     * Y, Fourth parameter is Z, Fifth parameter is world.
     */
    public final String whereIsCommandFormat;
    /**
     * First parameter is player name.
     */
    public final String joinConsoleFormat;
    /**
     * First parameter is player name.
     */
    public final String leaveConsoleFormat;

    public MessageFormats(String whereCommandFormat, String whereIsCommandFormat, String joinConsoleFormat, String leaveConsoleFormat) {
        this.whereCommandFormat = whereCommandFormat;
        this.whereIsCommandFormat = whereIsCommandFormat;
        this.joinConsoleFormat = joinConsoleFormat;
        this.leaveConsoleFormat = leaveConsoleFormat;
    }
}