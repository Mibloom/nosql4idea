/*
 * Copyright (c) 2015 David Boissier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codinjutsu.tools.nosql.view.editor.redis;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.ex.FakeFileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.codinjutsu.tools.nosql.utils.GuiUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RedisFakeFileType extends FakeFileType {

    public static final Icon REDIS_ICON = GuiUtils.loadIcon("redis.png");

    public static final FileType INSTANCE = new RedisFakeFileType();

    @Override
    public Icon getIcon() {
        return REDIS_ICON;
    }

    @Override
    public boolean isMyFileType(VirtualFile file) {
        return false;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "json";
    }

    @NotNull
    @Override
    public String getName() {
        return "REDIS";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "REDIS";
    }
}
