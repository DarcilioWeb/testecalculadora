import re

def enviar_email(email):
    padrao_email = r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'
    
    if not re.match(padrao_email, email):
        raise ValueError("Email inválido")
    
    return True