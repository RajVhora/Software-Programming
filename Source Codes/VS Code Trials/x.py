from decimal import Decimal
import tkinter.messagebox as tmsg
import math
from tkinter import *
from matplotlib.figure import Figure
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
import matplotlib
matplotlib.use("TkAgg")


root = Tk()
root.geometry("1900x960+0+0")
root.title("Model Rocket Motor")

f3 = Frame(root)
f3.grid(row=1, column=1, pady=15)


def Calculate(event):
    y = DoubleVar()
    y.set(0)
    l = DoubleVar()
    l.set(Rin_maxvalue.get()-R_filletvalue.get())
    S = DoubleVar()
    S = []
    # burnrate= DoubleVar()
    # burnrate.set(10)
    timestep = DoubleVar()
    timestep.set(0.001)
    temp = IntVar()
    temp.set(0)
    temparr = DoubleVar()
    temparr = []
    rho_p = DoubleVar()
    a1 = DoubleVar()
    n = DoubleVar()
    a = DoubleVar()

    Mw = DoubleVar()
    k = DoubleVar()
    R_g = DoubleVar()
    T1 = DoubleVar()
    c_star = DoubleVar()

    # Propellant Properties from Nasa CEA
    Mw.set(0.026424)  # Molecular weight in kg
    k.set(1.1216)  # gamma
    R_g.set(8.314 / Mw.get())  # Gas Constant
    T1.set(3481.59)  # Chamber Temperature in K
    c_star.set(math.sqrt(R_g.get() * T1.get() / k.get()) / math.pow((2 /
               (k.get() + 1)), (0.5 * (k.get() + 1) / (k.get() - 1))))  # c star in m/s

    Cf_0 = DoubleVar()
    Athroat = DoubleVar()
    Cf_0.set(math.sqrt((2 * k.get() * k.get() / (k.get() - 1)) * (math.pow((2 / (k.get() + 1)), ((k.get() + 1) / (k.get() - 1)))
             * (1 - (math.pow((100000 / Pressure_0value.get()), ((k.get() - 1) / k.get())))))))  # Cf at optimim expansion
    Athroat.set(Thrust_0value.get() / (Cf_0.get() * Pressure_0value.get()))

    rho_p.set(1807.577)  # Propellant Density in kg / m ^ 3
    a1.set(1.21)  # (mm / s) / bar ^ n
    n.set(0.43)  # Propellant
    a.set(a1.get() * (math.pow(10, -3)) / math.pow(10,
          (5.0 * (n.get()))))  # converted to SI units

    burn_rate = DoubleVar()
    burn_rate = [a.get() * math.pow(Pressure_0value.get(), n.get())]
    burn_area = DoubleVar()
    burn_area = []
    P_chamber = DoubleVar()
    P_chamber = []

    while y.get() < webvalue.get():
        y.set(y.get() + burn_rate[temp.get()]*timestep.get())
        if (y.get() + R_filletvalue.get())/l.get() < math.sin(Fractionvalue.get() * math.pi / nvalue.get())/math.cos(Thetavalue.get() / 2):
            S.append(2*nvalue.get()*l.get()*(math.sin(Fractionvalue.get()*math.pi / nvalue.get())/math.sin(Thetavalue.get()/2)+(y.get()+R_filletvalue.get()) /
                     l.get()*(math.pi / 2+math.pi / nvalue.get()-Thetavalue.get()/2-(1/math.tan(Thetavalue.get()/2)))+(1-Fractionvalue.get())*math.pi / nvalue.get()))
        else:
            S.append(2 * nvalue.get() * l.get() * ((y.get() + R_filletvalue.get()) / l.get() * (math.pi / nvalue.get() + math.asin(l.get()/(y.get() +
                     R_filletvalue.get())*math.sin(Fractionvalue.get()*math.pi / nvalue.get()))) + (1 - Fractionvalue.get()) * math.pi / nvalue.get()))
        burn_area.append(S[temp.get()] * Lengthvalue.get())
        P_chamber.append(math.pow((rho_p.get(
        ) * burn_area[temp.get()] * a.get() * c_star.get() / Athroat.get()), (1 / (1 - n.get()))))
        burn_rate.append(a.get() * math.pow(P_chamber[temp.get()], n.get()))
        temp.set(temp.get() + 1)
        temparr.append((temp.get() + 1) * timestep.get())
        print(burn_rate[temp.get()])
        # print(burn_rate[temp.het()])
        # print(burn_rate[temp.het()])

    fig1 = Figure(figsize=(4, 3), dpi=100)
    fig2 = fig1.add_subplot(111)
    fig2.plot(temparr, S)
    canvas = FigureCanvasTkAgg(fig1, f3)
    canvas.get_tk_widget().grid(row=12, column=6)
    fig2.set_ylabel('Burn Perimeter (m)', color='red')
    fig2.set_xlabel('Time (s)')


StarPoints = Label(f3, text="Number of star points")
Web = Label(f3, text="Web thickness")
Rin_max = Label(f3, text="Maximum inner radius")
Theta = Label(f3, text="Opening of star points")
Fraction = Label(f3, text="Angular fraction")
R_fillet = Label(f3, text="Fillet radius")
Pressure_0 = Label(f3, text="Initial Chamber Pressure")
Length = Label(f3, text="Length of grain")
Thrust0 = Label(f3, text=" Initial thrust")
# Number of star points – n
# Web thickness – w
# Maximum inner radius – l + f
# Opening of star points - 
# Angular fraction - ɛ
# Fillet radius – f

# Pack text for our form
StarPoints.grid(row=1, column=2)
Web.grid(row=2, column=2)
Rin_max.grid(row=3, column=2)
Theta.grid(row=4, column=2)
Fraction.grid(row=5, column=2)
R_fillet.grid(row=6, column=2)
Pressure_0.grid(row=7, column=2)
Length.grid(row=8, column=2)
Thrust0.grid(row=9, column=2)

# Tkinter variable for storing entries
nvalue = DoubleVar()
nvalue2 = StringVar()
webvalue = DoubleVar()
webvalue2 = StringVar()
Thetavalue = DoubleVar()
Thetavalue2 = StringVar()
Fractionvalue = DoubleVar()
Fractionvalue2 = StringVar()
R_filletvalue = DoubleVar()
R_filletvalue2 = StringVar()
Thrust_0value = DoubleVar()
Thrust_0value2 = StringVar()
Rin_maxvalue = DoubleVar()
Rin_maxvalue2 = StringVar()
Pressure_0value2 = StringVar()
Pressure_0value = DoubleVar()
Lengthvalue = DoubleVar()
Lengthvalue2 = StringVar()

# Entries for our form
nentry = Entry(f3, textvariable=nvalue2)
nentry.insert(0, '5')
nentry.grid(row=1, column=3, padx=3)

webentry = Entry(f3, textvariable=webvalue2)
webentry.insert(0, '0.2')
webentry.grid(row=2, column=3, padx=3)

Rin_maxentry = Entry(f3, textvariable=Rin_maxvalue2)
Rin_maxentry.insert(0, '0.2')
Rin_maxentry.grid(row=3, column=3, padx=3)

Thetaentry = Entry(f3, textvariable=Thetavalue2)
Thetaentry.insert(0, '1.8')
Thetaentry.grid(row=4, column=3, padx=3)

Fractionentry = Entry(f3, textvariable=Fractionvalue2)
Fractionentry.insert(0, '0.5')
Fractionentry.grid(row=5, column=3, padx=3)

R_filletentry = Entry(f3, textvariable=R_filletvalue2)
R_filletentry.insert(0, '5')
R_filletentry.grid(row=6, column=3, padx=3)

Pressure_0entry = Entry(f3, textvariable=Pressure_0value2)
Pressure_0entry.insert(0, '50')
Pressure_0entry.grid(row=7, column=3, padx=3)

Lengthentry = Entry(f3, textvariable=Lengthvalue2)
Lengthentry.insert(0, '0.5')
Lengthentry.grid(row=8, column=3, padx=3)

Thrust_0entry = Entry(f3, textvariable=Thrust_0value2)
Thrust_0entry.insert(0, '5000')
Thrust_0entry.grid(row=9, column=3, padx=3)

myfloat = Decimal(nvalue2.get())
nvalue.set(myfloat)

myfloat2 = Decimal(webvalue2.get())
webvalue.set(myfloat2)

myfloat3 = Decimal(Rin_maxvalue2.get())
Rin_maxvalue.set(myfloat3)

myfloat4 = Decimal(Thetavalue2.get())
Thetavalue.set(myfloat4)

myfloat5 = Decimal(Fractionvalue2.get())
Fractionvalue.set(myfloat5)

myfloat6 = Decimal(R_filletvalue2.get())
R_filletvalue.set(myfloat6/1000)

myfloat7 = Decimal(Pressure_0value2.get())
Pressure_0value.set(myfloat7*100000)

myfloat8 = Decimal(Lengthvalue2.get())
Lengthvalue.set(myfloat8)

myfloat9 = Decimal(Thrust_0value2.get())
Thrust_0value.set(myfloat9)

# Total_Massunit = Label(f3, text="kg")
# D_outerunit = Label(f3, text="cm")
# A_Drogueunit = Label(f3, text="m^2")
# A_mainsunit = Label(f3, text="m^2")
# H_mainsunit = Label(f3, text="km")
# Thrust_0unit = Label(f3, text="N")
# D_innerunit = Label(f3, text="cm")
# D_outer_grainunit= Label(f3, text="cm")
# Pressure_0unit = Label(f3, text="Pa")
#
# # Pack text for our form
# Total_Massunit.grid(row=1, column=4)
# D_outerunit.grid(row=2, column=4)
# A_Drogueunit.grid(row=3, column=4)
# A_mainsunit.grid(row=4, column=4)
# H_mainsunit.grid(row=5, column=4)
# Thrust_0unit.grid(row=6, column=4)
# D_innerunit.grid(row=7, column=4)
# D_outer_grainunit.grid(row=8, column=4)
# Pressure_0unit.grid(row=9, column=4)

b1 = Button(f3, fg="red", text="Start Analysis",
            command=lambda: Calculate(""), pady=3)
b1.grid(row=10, column=2, columnspan=3, pady=5)

root.mainloop()
