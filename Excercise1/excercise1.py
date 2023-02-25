from datetime import date
from calendar import monthrange

def input_to_day(time):
    day = time%100
    time = time//100
    month = time%100
    time = time//100
    year = time
    return date(year, month, day)

def total_number_of_days():
    start_date = int(input('Input start day:'))
    end_date = int(input('Input end day:'))
    total_day = input_to_day(end_date) - input_to_day(start_date)
    print(f"    Total number of day: {total_day.days}")

def reformat_time(year, month, day):
    max_day_next_month = 0
    
    if month > 12:
        year += month//12
        month = month%12
        
    max_day_next_month = monthrange(year, month)[1]

    if day > max_day_next_month:
        day = day - max_day_next_month
        month = month + 1

        reformat_time(year, month, day)

    return year, month, day

def calculate_end_date():
    start = int(input('Input start day: '))
    months_add = int(input('Input number of months added: '))

    start_time = input_to_day(start)

    day = start_time.day
    month = start_time.month + months_add
    year = start_time.year
    
    year, month, day = reformat_time(year, month, day)
    
    end_date = "".join(str(date(year, month, day)).split('-'))
    print(f"   End date: {end_date}")

print("   ---------------------------   ")
print('-----  1. Caculate number of days  -----')

total_number_of_days()

print("   \n\n----------------------------   ")
print('-----  2. Caculate close date  -----')

calculate_end_date()