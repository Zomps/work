echo "Enter the number"
read a
c=0
for ((i=1;i<=$a;i++))
do
if [ `expr $a % $i` -eq 0 ]
then
c=`expr $c + 1`
fi
done
if [ $c -eq 2 ]
then
echo "Prime"
else
echo "not prime"
fi
