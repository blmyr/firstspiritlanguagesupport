/*
* Copyright 2014 Markus Priegl
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.intellij.plugins.firstspirit.languagesupport.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.plugins.firstspirit.languagesupport.FirstSpiritOutputChannelFileType;
import com.intellij.plugins.firstspirit.languagesupport.FirstSpiritOutputChannelLanguage;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class FirstSpiritOutputChannelFile extends PsiFileBase {
    public FirstSpiritOutputChannelFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FirstSpiritOutputChannelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return FirstSpiritOutputChannelFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "FirstSpiritOutputChannel";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

}