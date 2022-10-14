def frequencySort(s):
        # Map the characters (keys) to the number of occurances (values).
        dic = {}
        for ch in s:
            if ch not in dic:
                dic[ch]=0
            dic[ch]+=1
        
        # Since we want an inverse of this map with characters as values and number of occurances as key, we will do the neccesary conversion.
        
        freq = {}
        for key,val in dic.items():
            if val not in freq:
                freq[val] = []
            freq[val].append(key)
            
        ans_string = ""
        # Create the required string by iterating over our inverted map in reverse order (from biggest key to smalled key).
        i=len(s)
        while i>=0:
            if i in freq:
                for val in freq[i]:
                    ans_string += i*val
            i-=1
        return ans_string

# call frequencysort function to sort the string using freq
input_string = input()
# print final string which is sotred by char
print(frequencySort(input_string))