import math

def AnomalyDetection(UserPattern, CurrentUsage, CurrentHour,threshold):
	if(CurrentUsage > UserPattern[CurrentHour]):
		if(math.sqrt((CurrentUsage.X - UserPattern.X)*(CurrentUsage.X - UserPattern.X) + (CurrentUsage.Y - UserPattern.Y)*(CurrentUsage.Y - UserPattern.Y) >= threshold):
			return 1
		return 0