package com.airstyl.faces;

/*
 * Copyright (c) 2017, Airstyl and/or its affiliates. All rights reserved.
 * AIRSTYL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Created by Joseph Okharedia on 2017-07-17.
 */

import com.airstyl.be360.spi.LoginTemplate;
import com.airstyl.be360.spi.UIInput;
import com.airstyl.be360.spi.UITemplate;
import com.airstyl.be360.spi.View;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@Dependent
public class LoginConfig {

    @Inject
    private Logger logger;

    @Produces
    @View("ui.login.view")
    @ApplicationScoped
    public UITemplate ui_login_view() {
        logger.info("=== creating UITemplate ===");
        return new LoginTemplate.BUILDER()
                .setUsername(new UIInput("Username:", ""))
                .setPassword(new UIInput("Password:", ""))
                .build();
    }
}
