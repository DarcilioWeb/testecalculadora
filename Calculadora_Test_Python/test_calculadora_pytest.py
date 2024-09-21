import pytest
from calculadora import *

def test_adicao_positiva():
    assert adicao(2, 3) == 5
    assert adicao(5, 9) == 14
    
def test_subtracao():
    assert subtracao(10, 5) == 5
    assert subtracao(10, 20) == -10
    assert subtracao(5, -5) == 10

def test_divisao():
    assert divisao(0, 999) == 0
    assert divisao(10, 5) == 2
    assert divisao(10, 2) == 5
    
def test_divisao_zero():
    with pytest.raises(ZeroDivisionError):
        divisao(999, 0)
        
def test_multiplicacao():
    assert multiplicacao(5, 2) == 10
    assert multiplicacao(20, 5) == 100
    assert multiplicacao(0, 999) == 0
    assert multiplicacao(999, 0) == 0
    
def test_fatorial():
    assert fatorial(5) == 120
    assert fatorial(0) == 1
    assert fatorial(3) == 6
    
def test_potencia():
    assert potencia(5, 2) == 25
    assert potencia(2, 10) == 1024