/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.benchmark.core.interceptor;

import static org.jboss.weld.benchmark.core.Main.BATCH_SIZE_FAST;
import static org.jboss.weld.benchmark.core.Main.ITERATIONS;

import org.jboss.weld.benchmark.core.AbstractBenchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

@Warmup(batchSize = BATCH_SIZE_FAST, iterations = ITERATIONS)
@Measurement(batchSize = BATCH_SIZE_FAST, iterations = ITERATIONS)
public class InterceptorBenchmark extends AbstractBenchmark<InterceptedBean> {

    @Override
    protected Class<InterceptedBean> getBeanClass() {
        return InterceptedBean.class;
    }
}
