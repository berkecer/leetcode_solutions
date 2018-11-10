class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> mailParts = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');  // divide the local and domain
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {  // cut everything after plus in local
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll(".", ""); // replace all dots in local part
            mailParts.add(local + rest);
        }

        return mailParts.size();
    }
}