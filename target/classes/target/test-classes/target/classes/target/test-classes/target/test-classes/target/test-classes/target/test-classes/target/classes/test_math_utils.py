import pytest
from MathUtils import MathUtils

class Test_Math_Utils:
    @pytest.fixture
    def math_utils(self):
        return MathUtils()

    def test_add(self, math_utils):
        assert math_utils.add(3, 3) == 6
        assert math_utils.add(-1, 1) == 0
        assert math_utils.add(0, 0) == 0

    def test_subtract(self, math_utils):
        assert math_utils.subtract(5, 2) == 3
        assert math_utils.subtract(2, 5) == -3
        assert math_utils.subtract(0, 0) == 0

    def test_multiply(self, math_utils):
        assert math_utils.multiply(2, 3) == 6
        assert math_utils.multiply(-2, 3) == -6
        assert math_utils.multiply(0, 5) == 0

    def test_divide(self, math_utils):
        assert math_utils.divide(10, 5) == 2.0
        assert math_utils.divide(5, 2) == 2.5
        assert math_utils.divide(0, 5) == 0.0
        assert math_utils.divide(10, 0) == -1.0
