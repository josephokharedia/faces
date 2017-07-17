package com.airstyl.faces;

import com.airstyl.be360.spi.UIBean;
import com.airstyl.be360.spi.UITemplate;
import com.airstyl.be360.spi.View;
import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("ui.login.view")
public class LoginViewBean implements UIBean {

    @Inject
    private Logger logger;

    @Inject
    @View("ui.login.view")
    UITemplate loginTemplate;

    @Override
    public UITemplate getView() {
        logger.info("=== getView() ===");
        return this.loginTemplate;
    }

}
