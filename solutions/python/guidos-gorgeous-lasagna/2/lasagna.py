EXPECTED_BAKE_TIME = 40

def bake_time_remaining(time_in_oven):
    """Toma el timepo esperado que deberia estar la lasaña en el horno 
    y devuelve la resta del tiempo que ya lleva en el horno"""
    return EXPECTED_BAKE_TIME - time_in_oven

def preparation_time_in_minutes(number_of_layers):
    """Toma el numero de capas de la lasaña 
    y devuelve el resultado de multiplicarlo por dos"""
    return number_of_layers * 2

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calcula el tiempo total de preparacion, toma el numero de capas y el tiempo transcurrido
    y devuelve el tiempo de preparacion de capas mas el tiempo transcurrido"""
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time