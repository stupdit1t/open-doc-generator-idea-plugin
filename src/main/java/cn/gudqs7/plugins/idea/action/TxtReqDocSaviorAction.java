package cn.gudqs7.plugins.idea.action;

import cn.gudqs7.plugins.idea.savior.JavaToApiSavior;
import cn.gudqs7.plugins.idea.savior.JavaToJsonSavior;
import cn.gudqs7.plugins.idea.theme.ThemeHelper;

/**
 * @author wq
 */
public class TxtReqDocSaviorAction extends AbstractReqDocerSavior {

    public TxtReqDocSaviorAction() {
        super(new JavaToJsonSavior(ThemeHelper.getTxtTheme()), new JavaToApiSavior(ThemeHelper.getTxtTheme()));
    }
}
