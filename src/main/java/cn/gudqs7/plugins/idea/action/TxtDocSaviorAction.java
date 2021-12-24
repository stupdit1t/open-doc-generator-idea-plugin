package cn.gudqs7.plugins.idea.action;

import cn.gudqs7.plugins.idea.savior.JavaToDocSavior;
import cn.gudqs7.plugins.idea.theme.ThemeHelper;

/**
 * @author wq
 */
public class TxtDocSaviorAction extends AbstractDocerSavior {

    public TxtDocSaviorAction() {
        super(new JavaToDocSavior(ThemeHelper.getTxtTheme()));
    }

}
