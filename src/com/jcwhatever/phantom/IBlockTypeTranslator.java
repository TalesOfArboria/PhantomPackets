/*
 * This file is part of PhantomPackets for Bukkit, licensed under the MIT License (MIT).
 *
 * Copyright (c) JCThePants (www.jcwhatever.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.jcwhatever.phantom;

import com.jcwhatever.nucleus.utils.coords.ChunkBlockInfo;
import com.jcwhatever.nucleus.utils.coords.WorldInfo;

import org.bukkit.Material;

import javax.annotation.Nullable;

/**
 * Interface for a delegate to get alternative block info from.
 */
public interface IBlockTypeTranslator {

    /**
     * Translate block info.
     *
     * @param world       The world the block is in.
     * @param x           The world X coordinates.
     * @param y           The world Y coordinates.
     * @param z           The world Z coordinates.
     * @param material    The material of the current block.
     * @param meta        The current block meta
     *
     * @return  Null to leave block as is.
     */
    @Nullable
    ChunkBlockInfo translate(WorldInfo world, int x, int y, int z, Material material, byte meta);
}