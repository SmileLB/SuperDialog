package com.example.superdialoglibrary;

import java.io.Serializable;

public interface ViewConvertListener extends Serializable {
    void convertView(ViewHolder holder, BaseSuperDialog dialog);
}
