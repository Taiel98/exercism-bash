def is_criticality_balanced(temperature, neutrons_emitted):
    if temperature < 800 and neutrons_emitted > 500 and neutrons_emitted * temperature < 500000:
        return True
    else:
        return False

def reactor_efficiency(voltage, current, theoretical_max_power):
    generate_power = voltage * current
    percentage_value = (generate_power/theoretical_max_power)*100
    if percentage_value >= 80:
        return "green"
    elif percentage_value >= 60:
        return "orange"
    elif percentage_value >= 30:
        return "red"
    else:
        return "black"

def fail_safe(temperature, neutrons_produced_per_second, threshold):
    output = temperature * neutrons_produced_per_second
    lower_bound = threshold * 0.9
    upper_bound = threshold * 1.1

    if output < lower_bound:
        return 'LOW'
    elif lower_bound <= output <= upper_bound:
        return 'NORMAL'
    else:
        return 'DANGER'