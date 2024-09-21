import unittest
from calculadora import *

class TestAdicao(unittest.TestCase):
    def test_soma(self):
        self.assertEqual(adicao(5,5), 10)
        self.assertEqual(adicao(10, -5), 5)
        self.assertEqual(adicao(5, 0), 5)
        
class TestSubtrair(unittest.TestCase):
    def test_subtracao(self):
        self.assertEqual(subtracao(10, 5), 5)
        self.assertEqual(subtracao(10, -5), 15)
        self.assertEqual(subtracao(5, 0), 5)
        
class TestMultiplicar(unittest.TestCase):    
    def test_multiplicacao(self):
        self.assertEqual(multiplicacao(10, 2), 20)
        self.assertEqual(multiplicacao(10, -5), -50)
        self.assertEqual(multiplicacao(5, 0), 0)
        
class TestDividir(unittest.TestCase):
    def test_divisao_valida(self):
        self.assertEqual(divisao(10, 2), 5)
        self.assertEqual(divisao(20, 2), 10)
        self.assertEqual(divisao(0, 999), 0)
        
    def test_divisao_zero(self):
        with self.assertRaises(ZeroDivisionError):
            divisao(1, 0)

class TestFatorial(unittest.TestCase):
    def test_fatorial_positivo(self):
        self.assertEqual(fatorial(5), 120)

    def test_fatorial_zero(self):
        self.assertEqual(fatorial(0), 1)
        
class TestPotencia(unittest.TestCase):
    def test_potencia_error(self):
        with self.assertRaises(ZeroDivisionError):
            potencia(0, -1)
            
    def test_potencia(self):
        self.assertEqual(potencia(2, 10), 1024)
        self.assertEqual(potencia(0, 0), 1)
        self.assertEqual(potencia(0, 10), 0)
        