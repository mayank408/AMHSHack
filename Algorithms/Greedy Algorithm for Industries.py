%Greedy Algorithm for Industries
import numpy as np

class Industry(object, ElectricUnitsConsumed, HoursOfOperation):
	self.ElectricConsumption = ElectricUnitsConsumed
	self.HoursOfOperation = HoursOfOperation
	self.start = np.array()


Fertilizers = Industry(EUF, HOOF)
Juice = Industry(EUJ,HOOJ)
Bread = Industry(EUB, HOOB)

Industries = {Fertilizers,Juice,Bread}

class Greedy(object, Industries, CityAverage)
	self.Industries = Industries
	self.CityAverage = CityAveage

	def func(self):
		for i,lem in enumerate(Industries[0]):
			max = 0, smax = 0, least = 0
			if(Industries[0].EUJ[i]> Industries[1].EUJ[i] && Industries[0].EUJ[i]>Industries[2].EUJ[i]):
				max = 0
				if(Industries[1].EUJ[i]>Industries[2].EUJ[i]):
					smax = 1
					least = 2
				else:
					smax = 2
					least = 1

			elif(Industries[1].EUJ[i]> Industries[2].EUJ[i] && Industries[1].EUJ[i]>Industries[0].EUJ[i]):
				max = 1
				if(Industries[0].EUJ[i]>Industries[2].EUJ[i]):
					smax = 0
					least = 2
				else:
					smax = 2
					least = 0

			else:
				max = Industries[2]
				if(Industries[1].EUJ[i]>Industries[0].EUJ[i]):
					smax = 1
					least = 0
				else:
					smax = 0
					least = 1			

			minval = 999999999
			startmax = 0
			startsecondmax = 0
			startleast = 0

			for j in np.linspace(0,24-Industries[max].EUJ[i],1):
				if(sum(CityAverage,j,j+Industries[max].EUJ[i]) < minval):
					minval = sum(CityAverage,j,j+Industries[max].EUJ[i])
					startmax = j

			minval = 999999999

			for j in np.linspace(0,24-Industries[smax].EUJ[i],1):
				if(sum(CityAverage,j,j+Industries[smax].EUJ[i]) < minval):
					minval = sum(CityAverage,j,j+Industries[smax].EUJ[i])
					startsmax = j

			minval = 999999999

			for j in np.linspace(0,24-Industries[least].EUJ[i],1):
				if(sum(CityAverage,j,j+Industries[least].EUJ[i]) < minval):
					minval = sum(CityAverage,j,j+Industries[least].EUJ[i])
					startleast = j

			Industries[max].start.append(startmax)
			Industries[smax].start.append(startsecondmax)
			Industries[least].start.append(startleast)

