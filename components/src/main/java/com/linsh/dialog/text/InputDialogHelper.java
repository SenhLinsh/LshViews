package com.linsh.dialog.text;

import com.linsh.dialog.DefaultDialogHelper;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2019/10/14
 *    desc   :
 * </pre>
 */
public interface InputDialogHelper extends DefaultDialogHelper {

    InputDialogHelper setText(CharSequence text);

    CharSequence getText();
}
