# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import petstore_api
from petstore_api.rest import ApiException
from petstore_api.models.category import Category


class TestCategory(unittest.TestCase):
    """ Category unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCategory(self):
        """
        Test Category
        """
        # FIXME: construct object with mandatory attributes with example values
        #model = petstore_api.models.category.Category()
        pass


if __name__ == '__main__':
    unittest.main()
