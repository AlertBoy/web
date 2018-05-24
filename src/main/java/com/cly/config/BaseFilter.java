package com.cly.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BaseFilter {

	protected final Logger log = LoggerFactory.getLogger(getClass());
	protected static final Set<String> NO_NEED_LOGIN_PATHS = Collections.unmodifiableSet(new HashSet<>(  
            Arrays.asList("/", "/user/login","/favicon.ico","/error.json")));

}
