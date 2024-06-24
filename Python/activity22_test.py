import pytest
import math
def test_add():
    num1 = 10
    num2 = 20
    sum = num1 + num2
    assert sum == 30
@pytest.mark.activity    
def test_difference():
     num3 = 50
     num4 = 10
     diference = num3 - num4
     assert diference == 40
@pytest.mark.activity
def test_product() :
    num5 = 10
    num6 = 5
    product = num5 * num6
    assert product == 50
@pytest.mark.activity
def test_quotient():
     num7 = 100
     num8 = 10
     quotient = num7 / num8
     assert quotient == 10