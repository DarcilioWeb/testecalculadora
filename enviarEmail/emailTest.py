import pytest
from enviaremail import *

def enviar_email_erro(email):
     with pytest.raises(ValueError):
              enviar_email(darciliogomes.com)