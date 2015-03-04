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

package org.codinjutsu.tools.nosql;

import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.project.Project;
import org.codinjutsu.tools.nosql.view.NoSqlWindowManager;
import org.jetbrains.annotations.NotNull;


public class NoSqlComponent extends AbstractProjectComponent {

    private static final String COMPONENT_NAME = "NoSql";

    public NoSqlComponent(Project project) {
        super(project);

    }

    @NotNull
    public String getComponentName() {
        return COMPONENT_NAME;
    }


    public void projectOpened() {
        NoSqlWindowManager.getInstance(myProject);
    }

    public void projectClosed() {
        NoSqlWindowManager.getInstance(myProject).unregisterMyself();
    }
}
