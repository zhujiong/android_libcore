/*
 * Copyright (C) 2007 The Android Open Source Project
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

package tests.security.cert;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * This is autogenerated source file. Includes tests for package tests.api.java.security.cert;
 */

public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }

    public static Test suite() {
        TestSuite suite = tests.TestSuiteFactory.createTestSuite("All tests for package tests.api.java.security.cert;");
        // $JUnit-BEGIN$

        suite.addTestSuite(CRLExceptionTest.class);
        suite.addTestSuite(CRLTest.class);
        suite.addTestSuite(CertPathBuilder1Test.class);
        suite.addTestSuite(CertPathBuilder2Test.class);
        suite.addTestSuite(CertPathBuilderExceptionTest.class);
        suite.addTestSuite(CertPathBuilderSpiTest.class);
        suite.addTestSuite(CertPathCertPathRepTest.class);
        suite.addTestSuite(CertPathTest.class);
        suite.addTestSuite(CertPathValidator1Test.class);
        suite.addTestSuite(CertPathValidator2Test.class);
        suite.addTestSuite(CertPathValidator3Test.class);
        suite.addTestSuite(CertPathValidatorExceptionTest.class);
        suite.addTestSuite(CertPathValidatorSpiTest.class);
        suite.addTestSuite(CertStore1Test.class);
        suite.addTestSuite(CertStoreExceptionTest.class);
        suite.addTestSuite(CertStoreSpiTest.class);
        suite.addTestSuite(CertificateCertificateRepTest.class);
        suite.addTestSuite(CertificateEncodingException2Test.class);
        suite.addTestSuite(CertificateEncodingExceptionTest.class);
        suite.addTestSuite(CertificateException2Test.class);
        suite.addTestSuite(CertificateExceptionTest.class);
        suite.addTestSuite(CertificateExpiredExceptionTest.class);
        suite.addTestSuite(CertificateFactory1Test.class);
        suite.addTestSuite(CertificateFactory2Test.class);
        suite.addTestSuite(CertificateFactory3Test.class);
        suite.addTestSuite(CertificateFactory4Test.class);
        suite.addTestSuite(CertificateFactorySpiTest.class);
        suite.addTestSuite(CertificateNotYetValidExceptionTest.class);
        suite.addTestSuite(CertificateParsingExceptionTest.class);
        suite.addTestSuite(CertificateTest.class);
        suite.addTestSuite(CollectionCertStoreParametersTest.class);
        suite.addTestSuite(LDAPCertStoreParametersTest.class);
        suite.addTestSuite(PKIXBuilderParametersTest.class);
        suite.addTestSuite(PKIXCertPathBuilderResultTest.class);
        suite.addTestSuite(PKIXCertPathCheckerTest.class);
        suite.addTestSuite(PKIXCertPathValidatorResultTest.class);
        suite.addTestSuite(PKIXParametersTest.class);
        suite.addTestSuite(PolicyQualifierInfoTest.class);
        suite.addTestSuite(TrustAnchorTest.class);
        suite.addTestSuite(X509CRL2Test.class);
        suite.addTestSuite(X509CRLEntryTest.class);
        suite.addTestSuite(X509CRLSelector2Test.class);
        suite.addTestSuite(X509CRLSelectorTest.class);
        suite.addTestSuite(X509CRLTest.class);
        // Crashes on RI.
        // suite.addTestSuite(X509CertSelectorTest.class);
        suite.addTestSuite(X509Certificate2Test.class);
        suite.addTestSuite(PolicyNodeTest.class);

        // $JUnit-END$
        return suite;
    }
}
